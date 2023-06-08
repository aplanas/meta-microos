SUMMARY = "Tool for managing Platform.sh services from the command line"
DESCRIPTION = "The Platform.sh CLI is the official command-line interface for Platform.sh. \
Use this tool to interact with Platform.sh projects, and to build them \
locally for development purposes."
LICENSE = "MIT"

PV = "3.67.2"

RPM_NAME = "platformsh-cli-3.67.2-1.6.noarch.rpm"
RPM_HASH = "faaf0865910f4d8f1b6de33e66ade3a295c3475060997bcf3d5f259de0f6f2758133bbdc65a44b9998142baf56bf9cc428b054a318969cd738a68890724b8efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "platformsh-cli"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env php"

inherit rpm
