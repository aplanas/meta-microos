SUMMARY = "Noto Sinhala Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sinhala Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sinhala-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e6bd4200947f86c24340389124410a543ec0fbf418163adf58f3b4aa193472cb2f56ea79b813af69377434cb0b71e710e76d02b8e72f2ad8986ca939a441f50f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sinhala-ui \
noto-sans-sinhala-ui-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
