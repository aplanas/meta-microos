SUMMARY = "Noto Sans Korean Font - Black"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Black weight of \
Sans font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-black-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "10947482094a07d12a8c2f51f8a97904059a01b4ba784dda972f2f0bd60a6e44b27834137494b4f5668d5f29d8481558524d9de0ebd024035a2dec8be66f463c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-black-fonts noto-sans-kr-black-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
