SUMMARY = "Noto Vithkuqi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Vithkuqi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-vithkuqi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "2a4b27c8724e5efd0698e1f21b63828ab9993d820e93e81ccab51e6bf31ca8750d89f7bd73a75e1dcaf334c7c9c2e87f748954603fd4d408129bbfe9a9ec19f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-vithkuqi \
noto-sans-vithkuqi-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
