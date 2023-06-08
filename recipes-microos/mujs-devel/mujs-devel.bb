SUMMARY = "MuJS development files"
DESCRIPTION = "This package provides the MuJS static library."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3.2"

RPM_NAME = "mujs-devel-1.3.2-2.3.aarch64.rpm"
RPM_HASH = "f226e272bb3694858950e3591a4cd8c7639add3c10b20084ebdb979d57542df3ae6432e536ff6513e32b16d4812897a0465705b1edfd331078a1a5a872c5225f"

RPROVIDES:${PN} += "mujs-devel mujs-devel(aarch-64) mujs-static pkgconfig(mujs)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
