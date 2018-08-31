package pl.sda.bookstore.customer;

import java.util.Objects;

public class Company extends Customer{

    private final String companyName;
    private final String taxCode;


    public Company(String address, String companyName, String taxCode) {
        super(address);
        this.companyName = companyName;
        this.taxCode = taxCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTaxCode() {
        return taxCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Company company = (Company) o;
        return Objects.equals(companyName, company.companyName) &&
                Objects.equals(taxCode, company.taxCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), companyName, taxCode);
    }
}
