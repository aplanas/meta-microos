SUMMARY = "Development files for the Osmocom GSM A-bis library"
DESCRIPTION = "This library contains common/shared code regarding the GSM A-bis \
interface. It also implements drivers for mISDN and DAHDI-based E1 \
cards, as well as some A-bis/IP dialects. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmoabis."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmoabis-devel-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "875a6b15bd8e12e1351a8be23bedef1fce816395d82997233640708261658090cca81530d83a253b8677f3e7659bd84536f52e4e01b864723abbab0811ff4f8c"

RPROVIDES:${PN} += "libosmoabis-devel libosmoabis-devel(aarch-64) pkgconfig(libosmoabis)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmoabis10 libosmocore-devel libosmogsm-devel"

inherit rpm
