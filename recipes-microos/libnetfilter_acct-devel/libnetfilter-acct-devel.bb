SUMMARY = "Userspace library for the in-kernel Netfilter counters"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter extended accounting infrastructure."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libnetfilter_acct-devel-1.0.3-2.10.aarch64.rpm"
RPM_HASH = "62279b4cc49bcd49f2917077b51a7162bac918bd718be24fdea4af66f09e60c53150de604b5e192337f21bbc6e9d43d91eee51b8413c72671e8cf23d27f91c31"

RPROVIDES:${PN} += "libnetfilter_acct-devel libnetfilter_acct-devel(aarch-64) pkgconfig(libnetfilter_acct)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libnetfilter_acct1"

inherit rpm
