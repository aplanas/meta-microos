SUMMARY = "Base files for the Quassel IRC client"
DESCRIPTION = "Quassel IRC is a distributed IRC client, meaning that one (or \
multiple) client(s) can attach to and detach from a central core -- \
much like the combination of GNU Screen and a text-based IRC client \
such as WeeChat, but graphical. \
 \
This contains common parts shared by quassel and quassel-client."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "quassel-base-0.14.0-1.5.aarch64.rpm"
RPM_HASH = "174e6add7aaccae57efebfe6035f70eebd5a3312721db9dfad1b981233bf96b6ac7f70382950c595170fc7ef759613f9c885cf04e483912fa0ad4be1ab1cf8ad"

RPROVIDES:${PN} += "application() \
application(quasselclient.desktop) \
quassel-base \
quassel-base(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
quassel_ui"

inherit rpm
