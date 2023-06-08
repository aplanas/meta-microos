SUMMARY = "Japanese online manuals for X11"
DESCRIPTION = "Japanese online manuals for X11 \
 \
 \
 \
Authors: \
-------- \
    X Japanese Documentation Project <xjman-ml@dsl.gr.jp>"
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "xmanja-0.7-461.16.noarch.rpm"
RPM_HASH = "9818fc61123d5ac6c1a83d61fd1f18fd4e7209794ff2cdd49688e61ea044eb64b654ce70be9b1d0dc249d74086ebaa24cdf6ac02a72d5efc93b47fcc734e33ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xorg-x11:ja) xmanja"
RDEPENDS:${PN} += ""

inherit rpm
