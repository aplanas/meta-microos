SUMMARY = "Read and write RDF syntax"
DESCRIPTION = "Read and write RDF syntax."
LICENSE = "ISC"

PV = "0.30.16"

RPM_NAME = "serdi-0.30.16-1.1.aarch64.rpm"
RPM_HASH = "26a942c3fed4effc64bc5162df026c58fe308884889332458a082c2e046dacc12557ed3844463e85bae26734360f0a5f1a79b2cd799addf0d9d8b51886467c38"

RPROVIDES:${PN} += "serdi serdi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libserd-0.so.0()(64bit)"

inherit rpm
