SUMMARY = "Electron development headers"
DESCRIPTION = "Development headers for Electron projects."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.8"

RPM_NAME = "nodejs-electron-devel-22.3.8-1.2.aarch64.rpm"
RPM_HASH = "f310a5a4edcb2524b6959d48949c12ca8268024def03c1bc7d5c44609b0bcc34c08b4e52a173b29604b5f645938b3550aa66aeee3604ab427370047fc0b0cfcc"

RPROVIDES:${PN} += "nodejs-electron-devel nodejs-electron-devel(aarch-64) rpm_macro(electron_req)"
RDEPENDS:${PN} += "nodejs-electron(aarch-64) pkgconfig(zlib)"

inherit rpm
