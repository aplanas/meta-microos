SUMMARY = "A portable library for atomic memory operations"
DESCRIPTION = "Provides implementations for atomic memory update operations on a \
number of architectures. This allows direct use of these in reasonably \
portable code. Unlike earlier similar packages, this one explicitly \
considers memory barrier semantics, and allows the construction of code \
that involves minimum overhead across a variety of architectures."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "7.8.0"

RPM_NAME = "libatomic_ops-devel-7.8.0-1.1.aarch64.rpm"
RPM_HASH = "b358327ef665dc005e6a821cc18505e661e6c6631185bc97d0d9fe7fbb10141e3e5e1a3c7d74cb8f020d1ca06229082c31bd4b841e8ea0c58ae6697c2e671dd4"

RPROVIDES:${PN} += "libatomic-ops-devel libatomic_ops-devel libatomic_ops-devel(aarch-64) pkgconfig(atomic_ops)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
