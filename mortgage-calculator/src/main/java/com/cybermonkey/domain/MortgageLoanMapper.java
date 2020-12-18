package com.cybermonkey.domain;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.cybermonkey.domain.Price.EIGHT_HUNDRED;
import static com.cybermonkey.domain.Price.LESS_THAN_THRITY_THREE_HUNDRED;
import static com.cybermonkey.domain.Price.OVER_EIGHT_HUNDRED;
import static com.cybermonkey.domain.Price.SIX_HUNDRED;
import static com.cybermonkey.domain.Price.THRITY_THREE_HUNDRED;

public class MortgageLoanMapper {
    private static final List<MortgageDetail> MORTGAGE_LOAN_MAPPINGS = List.of(
            new MortgageDetail(21, 44, EIGHT_HUNDRED, OVER_EIGHT_HUNDRED, true, true, 0.5),
            new MortgageDetail(21, 44, SIX_HUNDRED, EIGHT_HUNDRED, true, true, 0.8),
            new MortgageDetail(21, 44, THRITY_THREE_HUNDRED, SIX_HUNDRED, true, true, 0.8),
            new MortgageDetail(21, 44, LESS_THAN_THRITY_THREE_HUNDRED, THRITY_THREE_HUNDRED, true, true, 0.9),
            new MortgageDetail(45, 200, EIGHT_HUNDRED, OVER_EIGHT_HUNDRED, true, true, 0.5),
            new MortgageDetail(45, 200, SIX_HUNDRED, EIGHT_HUNDRED, true, true, 0.6),
            new MortgageDetail(45, 200, THRITY_THREE_HUNDRED, SIX_HUNDRED, true, true, 0.7),
            new MortgageDetail(45, 200, LESS_THAN_THRITY_THREE_HUNDRED, THRITY_THREE_HUNDRED, true, true, 0.9),
            new MortgageDetail(0, 200, EIGHT_HUNDRED, OVER_EIGHT_HUNDRED, true, false, 0.4),
            new MortgageDetail(0, 200, SIX_HUNDRED, EIGHT_HUNDRED, true, false, 0.5),
            new MortgageDetail(0, 200, THRITY_THREE_HUNDRED, SIX_HUNDRED, true, false, 0.6),
            new MortgageDetail(0, 200, LESS_THAN_THRITY_THREE_HUNDRED, THRITY_THREE_HUNDRED, true, false, 0.7),
            new MortgageDetail(0, 200, EIGHT_HUNDRED, OVER_EIGHT_HUNDRED, false, false, 0.3),
            new MortgageDetail(0, 200, SIX_HUNDRED, EIGHT_HUNDRED, false, false, 0.4),
            new MortgageDetail(0, 200, THRITY_THREE_HUNDRED, SIX_HUNDRED, false, false, 0.5),
            new MortgageDetail(0, 200, LESS_THAN_THRITY_THREE_HUNDRED, THRITY_THREE_HUNDRED, false, false, 0.6)
    );

    public static Optional<MortgageDetail> calculateMortgageLoanPercentage(int age, boolean isCitizen, int price, boolean isFirstBuyer) {
        var citizenList = MORTGAGE_LOAN_MAPPINGS
                .stream()
                .filter(md -> md.isCitizenMatch(isCitizen))
                .filter(md -> md.isAgeMatch(age))
                .filter(md -> md.isPriceMatch(price))
                .collect(Collectors.toList());

        final var localMortgageDetail = citizenList.stream()
                                                   .filter(md -> md.isFirstBuyer(isFirstBuyer))
                                                   .findFirst();

        if (localMortgageDetail.isPresent()) {
            return localMortgageDetail;
        }
        return citizenList.stream().findFirst();

    }
}
