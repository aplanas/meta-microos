SUMMARY = "Pack Program"
DESCRIPTION = "Lha is a packer comparable to ZIP (PKZIP), ZOO, and others. It has been \
included for compatibility reasons only. Use GZIP for general archiving \
purposes, because it is the standard for Linux."
LICENSE = "SUSE-Public-Domain"

PV = "1.14.1~git.20191005"

RPM_NAME = "lha-1.14.1~git.20191005-1.13.aarch64.rpm"
RPM_HASH = "71aeaef2ba890272b071f40d52a49b4babbc8b216508276948ca3db461efe4ae55801a439f64fb6af655ac4ba9b7a2a6593368defb781bd83d42280572b2c0ed"

RPROVIDES:${PN} += "lha lha(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
