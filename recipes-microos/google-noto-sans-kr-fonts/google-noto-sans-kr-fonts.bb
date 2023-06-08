SUMMARY = "Noto Sans Korean Font - Regular and Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Regular and Bold \
weights of Sans font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "be13c86a56a563f08f97ec7887b598089b03449f35990740304af8873d7955421690b01e71c50bc949d0d949a27c22642aa2c43c24c8d6cdaa17be5a57fb70c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-fonts locale(ko) noto-sans-cjkkr noto-sans-cjkkr-fonts noto-sans-kr-fonts scalable-font-ko"
RDEPENDS:${PN} += "google-noto-sans-kr-bold-fonts google-noto-sans-kr-regular-fonts"

inherit rpm
