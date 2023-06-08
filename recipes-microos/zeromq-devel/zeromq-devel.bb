SUMMARY = "Development files for ZeroMQ"
DESCRIPTION = "The ZeroMQ messaging kernel is a library extending the standard \
socket interfaces with an abstraction of asynchronous message queues, \
multiple messaging patterns, message filtering (subscriptions) and \
seamless access to multiple transport protocols. \
 \
This package holds the development files for ZeroMQ."
LICENSE = "LGPL-3.0-or-later"

PV = "4.3.4"

RPM_NAME = "zeromq-devel-4.3.4-4.3.aarch64.rpm"
RPM_HASH = "193bc0329c3bb691614952a5a20d1f7cb474431eefd058aa0027f87eaf10741a7d7b062b7c6f095b6a309709aa57c4f9eab6efd6ca1b317ac9350fc8aeacf3a8"

RPROVIDES:${PN} += "libzmq-devel pkgconfig(libzmq) zeromq-devel zeromq-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libzmq5 pkgconfig(libsodium) pkgconfig(libunwind)"

inherit rpm
