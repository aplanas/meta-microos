SUMMARY = "Development files for phodav"
DESCRIPTION = "phodav is a WebDav server implementation using libsoup (RFC 4918). \
 \
This package provides the files needed for developing software using phodav."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "phodav-devel-3.0-1.3.aarch64.rpm"
RPM_HASH = "4342ac3ff35c98723197eaa84cc273700d04d033f8311d8ac0970e6284e15a3f2c9a1737ba078ad30f7c821a3e5f60e163dbe5e2c668a38f2f1d07cc5014f380"

RPROVIDES:${PN} += "phodav-devel phodav-devel(aarch-64) pkgconfig(libphodav-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libphodav-3_0-0 pkgconfig(gio-unix-2.0) pkgconfig(libsoup-3.0) pkgconfig(libxml-2.0)"

inherit rpm
