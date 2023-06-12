SUMMARY = "Isolated String helpers from B"
DESCRIPTION = "XString provides the B string helpers in one isolated package. Right now \
only cstring and perlstring are available."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-XString-0.005-1.15.aarch64.rpm"
RPM_HASH = "0720fb93345b0981113b9dd0ab8f513925ccd75acc9bda5ecba3650d637290b19091173d83816a7d7ed73ba930c979748cd52898a30d03dafb6edfc15123d19d"

RPROVIDES:${PN} += "perl(XString) \
perl-XString \
perl-XString(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
