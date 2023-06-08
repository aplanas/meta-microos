SUMMARY = "Plymouth 'Fade-In' theme"
DESCRIPTION = "This package contains the 'Fade-In' boot splash theme for \
Plymouth. It features a centered logo that fades in and out \
while stars twinkle around the logo during system boot up."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-fade-in-22.02.122+94.4bd41a3-4.1.noarch.rpm"
RPM_HASH = "571a08f98787451f254f7001223a1b31ef90ce9181c9b3fcaa4d416508a71ea60ddb7f6452c0c20ad3f10093817c4285c4abc255e48e5f6e38dfd294a4a9ae43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-fade-in"
RDEPENDS:${PN} += "/bin/sh plymouth-plugin-fade-throbber plymouth-plugin-label plymouth-scripts"

inherit rpm
