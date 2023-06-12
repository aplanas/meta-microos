SUMMARY = "Python tool configuration"
DESCRIPTION = "Python Tool Configuration \
 \
The goal of this project is to manage configuration for python tools, \
such as black and rope and add support for a pyproject.toml configuration file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python311-pytoolconfig-1.2.4-1.4.noarch.rpm"
RPM_HASH = "19119182fd4e4a5ed37b898edb4863ea63eaa87844e17c964adc2d386ef118f299f5ac75c4b7ded9e5d80ef3acd7524469d977dc92a096c77e828a684f549719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytoolconfig) \
python311-pytoolconfig \
python3dist(pytoolconfig)"
RDEPENDS:${PN} += "python(abi) \
python311-packaging"

inherit rpm
