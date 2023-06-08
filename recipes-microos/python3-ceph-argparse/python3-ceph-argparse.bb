SUMMARY = "Python 3 utility libraries for Ceph CLI"
DESCRIPTION = "This package contains types and routines for Python 3 used by the Ceph CLI as \
well as the RESTful interface. These have to do with querying the daemons for \
command-description information, validating user command input against those \
descriptions, and submitting the command to the appropriate daemon."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "python3-ceph-argparse-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "7ea7e2d358a2df08aa0c8de688404f3c9f1cd86ba8c7b818a3284742665fe27bcb70457fa930f5e865a23f7422f4deb168b8228e438c07c164cef154f608d417"

RPROVIDES:${PN} += "python3-ceph-argparse python3-ceph-argparse(aarch-64)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
