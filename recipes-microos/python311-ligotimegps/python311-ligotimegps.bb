SUMMARY = "A pure-python version of lalLIGOTimeGPS"
DESCRIPTION = "This module provides a pure-python version of the `LIGOTimeGPS` class, \
used to represent GPS times (number of seconds elapsed since GPS \
epoch) with nanoseconds precision. \
 \
This module is primarily for use as a drop-in replacement for the \
'official' `lal.LIGOTimeGPS` class (provided by the SWIG-python \
bindings of [LAL](//wiki.ligo.org/DASWG/LALSuite)) for use on those \
environments where LAL is not available, or building LAL is \
unnecessary for the application (e.g. testing). \
 \
The code provided here is much slower than the C-implementation \
provided by LAL, so if you really care about performance, don't use \
this module."
LICENSE = "GPL-3.0-only"

PV = "2.0.1"

RPM_NAME = "python311-ligotimegps-2.0.1-3.2.noarch.rpm"
RPM_HASH = "36822f4278083cc28ca3b6661d8c18471317d71c5e1da1fb1c14078157fa773190bf1234a10338e25eb4968c546f1b2dd8d3cdb38782ce3a2819057d45dba4e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ligotimegps) python311-ligotimegps python3dist(ligotimegps)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
