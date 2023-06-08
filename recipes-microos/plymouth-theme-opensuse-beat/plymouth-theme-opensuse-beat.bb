SUMMARY = "Theme opensuse-beat for Plymouth"
DESCRIPTION = "Theme opensuse-beat for Plymouth."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "plymouth-theme-opensuse-beat-1.0-1.8.noarch.rpm"
RPM_HASH = "660a79db03d3aca3b16fcd7f0cddf7af98da34b769277147b92bc12ef806aee58ca43b0129cbbe7ae046c92189b67255d070c56a2a2ef500135fbd9818f2d286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-opensuse-beat"
RDEPENDS:${PN} += "/bin/sh plymouth-scripts plymouth-theme-script"

inherit rpm
