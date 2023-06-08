SUMMARY = "A drop-in replacement for argparse"
DESCRIPTION = "ConfigArgParse allows options to also be set via config files and/or environment \
variables. \
 \
Applications with more than a handful of user-settable options are best configured \
through a combination of command line args, config files, hard-coded defaults, and \
in some cases, environment variables. \
 \
Python’s command line parsing modules such as argparse have very limited support \
for config files and environment variables, so this module extends argparse to \
add these features"
LICENSE = "MIT"

PV = "1.5.3"

RPM_NAME = "python39-ConfigArgParse-1.5.3-1.7.noarch.rpm"
RPM_HASH = "ca21b0226e0756583c7491f8bd67c174fb02d92eaa73c6e2285782d5709f4614700356cada95bedc37f929f90cbd7bec88c2389db9f7de14c7ff77ee8c2a9943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(configargparse) python39-ConfigArgParse python39-configargparse python3dist(configargparse)"
RDEPENDS:${PN} += "python(abi) python39-PyYAML python39-setuptools"

inherit rpm
