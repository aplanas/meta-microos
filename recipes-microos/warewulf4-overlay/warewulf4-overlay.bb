SUMMARY = "Default overlay for warewulf"
DESCRIPTION = "Includes the default overlays so that they can be updated seprately."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-overlay-4.4.0-6.4.aarch64.rpm"
RPM_HASH = "26f02d0986204fb885b058c721972ca9baf244182ed7f3280e1a9ed1fd114cd786da865cd82fec4738cde0d5474241abbdee414f9c1fcab5dc2393c0cb906a98"

RPROVIDES:${PN} += "config(warewulf4-overlay) warewulf4-overlay warewulf4-overlay(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh warewulf4"

inherit rpm
