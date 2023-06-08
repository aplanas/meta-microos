SUMMARY = "Development files for libcom_err"
DESCRIPTION = "Development files for the com_err error message display library."
LICENSE = "MIT"

PV = "1.46.5"

RPM_NAME = "libcom_err-devel-1.46.5-4.3.aarch64.rpm"
RPM_HASH = "b5fdb7e146a52477371d16a3240eaa1b7d0027f84d70d96b3d584366a61d2608a64494c7b45fcf26bdd5ecf605c4994ecab1b7e3ee4f5658d479c1cc00e2c27c"

RPROVIDES:${PN} += "libcom_err-devel libcom_err-devel(aarch-64) pkgconfig(com_err) pkgconfig(ss)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config glibc-devel libcom_err2 pkgconfig(com_err)"

inherit rpm
