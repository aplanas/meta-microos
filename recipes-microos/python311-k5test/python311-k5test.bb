SUMMARY = "A library for testing Python applications in krb5 environments"
DESCRIPTION = "k5test is a library for setting up self-contained Kerberos 5 environments, \
and running Python unit tests inside those environments.  It is based on \
the file of the same name found alongside the MIT Kerberos 5 unit tests."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python311-k5test-0.10.3-2.1.noarch.rpm"
RPM_HASH = "b0fda8cc710150145f0f80057f81778ad97ba41d504d272bd96aec2d70eba8852c19be1715170eca86af79df5cdc65953faacbaab369a6905641e58f4e303341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(k5test) \
python311-k5test \
python3dist(k5test)"
RDEPENDS:${PN} += "krb5-client \
krb5-server \
python(abi)"

inherit rpm
