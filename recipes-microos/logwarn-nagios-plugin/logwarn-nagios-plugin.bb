SUMMARY = "Nagios plugin based on the logwarn(1) utility"
DESCRIPTION = "logwarn searches for interesting messages in log files, where ``interest- \
ing'' is defined by an user-supplied list of positive and negative (pre- \
ceeded with a ``!'') extended regular expressions provided on the command \
line. \
 \
This package contains the Nagios plugin that is based on logwarn."
LICENSE = "Apache-2.0"

PV = "1.0.17"

RPM_NAME = "logwarn-nagios-plugin-1.0.17-1.3.noarch.rpm"
RPM_HASH = "c12adfc86ea06d1b92c9178a2211d53ca8d77d36f27940f59c91662109571fc1df1c9b13abf3546ba2c70fe55fd576957958163ed15d0f821e0be831f26e8ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logwarn-nagios-plugin"
RDEPENDS:${PN} += "/usr/bin/bash bash logwarn"

inherit rpm
