SUMMARY = "Tool for automatic manual page building from a Python ArgumentParser object"
DESCRIPTION = "This utility generates a manual page in an automatic way from an \
ArgumentParser object, so the manpage 1:1 corresponds to the \
automatically generated --help output. The manpage generator needs to \
known the location of the object, user can specify that by (a) the \
module name or corresponding python filename and (b) the object name \
or the function name which returns the object. There's a limited \
support for (deprecated) optparse objects, too."
LICENSE = "Apache-2.0"

PV = "4.1"

RPM_NAME = "python39-argparse-manpage-4.1-1.1.noarch.rpm"
RPM_HASH = "44e90367a30ca7b1562e591cce47d8ecc1ab21143baa531c47a37972b4b6c3e93d2aa58e4224aca8a2f785073a6ad8d42d106c50674077a43a7fd1852f991f90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(argparse-manpage) \
python39-argparse-manpage \
python3dist(argparse-manpage)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-setuptools \
update-alternatives"

inherit rpm
