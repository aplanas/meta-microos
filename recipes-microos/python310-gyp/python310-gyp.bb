SUMMARY = "Generate Your Projects"
DESCRIPTION = "GYP is a tool to generates native Visual Studio, Xcode and SCons and/or make \
build files from a platform-independent input format. Its syntax is a universal \
cross-platform build representation that still allows sufficient per-platform \
flexibility to accommodate irreconcilable differences"
LICENSE = "BSD-3-Clause"

PV = "0+git.20230301"

RPM_NAME = "python310-gyp-0+git.20230301-1.1.noarch.rpm"
RPM_HASH = "3b4f8828d0c53cad3d51d06fd31eb309dd2c50baa3348b5d0180beb8cf4b7723f555a8ecf10057f427b40a577510351e797c8b5f99748cbf4499a07beed96186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gyp python3-gyp python3.10dist(gyp) python310-gyp python3dist(gyp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ninja python(abi) python310-setuptools update-alternatives"

inherit rpm
