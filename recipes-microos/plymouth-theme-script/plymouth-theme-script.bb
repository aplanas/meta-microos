SUMMARY = "Plymouth 'Script' theme"
DESCRIPTION = "This package contains the 'script' boot splash theme for \
Plymouth. It is a simple example theme the uses the 'script' \
plugin."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-script-22.02.122+94.4bd41a3-5.1.noarch.rpm"
RPM_HASH = "6d45a8b0d6c36bea4edc67ec7aefc5b9a41a1f5942ffbc1ad32f5c3d52220f428952c7d1d66486c22b93b92f105f901c5a3045283f7f1d897f72639c37af2bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-script"
RDEPENDS:${PN} += "plymouth-plugin-script plymouth-scripts"

inherit rpm
