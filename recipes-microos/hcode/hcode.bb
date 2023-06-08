SUMMARY = "Hangul Code Conversion Utilities (hcode, hdcode)"
DESCRIPTION = "Hangul code conversion utilities (hcode, hdcode). \
 \
 \
 \
Authors: \
-------- \
    Jungshik Shin &lt;jshin@pantheon.yale.edu&gt; \
    Sang-yong Suh &lt;sysuh@kigam.re.kr&gt;"
LICENSE = "GPL-2.0+"

PV = "2.1"

RPM_NAME = "hcode-2.1-677.25.aarch64.rpm"
RPM_HASH = "7e1d6cd83f5d0c28ea0a05d38e6c7e28f6427c8be8bf207558ffa422ed1fa6f7db1fe102a2d50d29efde4a6ec03402f772632a8decf6218ced48dd76b04f358f"

RPROVIDES:${PN} += "hcode hcode(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
