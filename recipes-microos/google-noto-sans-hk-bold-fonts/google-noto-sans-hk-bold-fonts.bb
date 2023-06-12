SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font - Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Bold weight of \
Sans font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-bold-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "f22dd0dcd4970486e56e5054165d1fa545b133bb2f436de43895e3785a9b7f35e6ebd845ff0002b4795331649e592b23730aa89ae0bff7da99baee6d297ae5c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-bold-fonts \
noto-sans-hk-bold-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
