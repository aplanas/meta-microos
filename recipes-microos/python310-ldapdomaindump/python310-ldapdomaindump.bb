SUMMARY = "Active Directory information dumper via LDAP"
DESCRIPTION = "Active Directory information dumper via LDAP."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python310-ldapdomaindump-0.9.4-1.4.noarch.rpm"
RPM_HASH = "27a0e8c4659ddf45264aa6c3b0e9ee546cdf8cfe78adfcdf08e682807d55b34b5d04b9da330216e2bca4da5412a23d764ed146f8defd0ed682c36b5ac12dba17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldapdomaindump python3.10dist(ldapdomaindump) python310-ldapdomaindump python3dist(ldapdomaindump)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-dnspython python310-future python310-ldap3"

inherit rpm
