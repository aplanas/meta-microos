SUMMARY = "A notifier for systems using transactional updates"
DESCRIPTION = "Add notifications, via Desktop Bus (D-Bus), about transactional updates for \
all users currently logged in in a graphical session. Being even possible \
for it to be used as a reboot method through transactional-updates.conf(5)."
LICENSE = "GPL-3.0-only"

PV = "1.1.0.2"

RPM_NAME = "transactional-update-notifier-1.1.0.2-1.3.aarch64.rpm"
RPM_HASH = "04348e362a2a1aea9b636b3bfecdc0c05f4800925f3bc7cc809e9013ab51ca2c5071dea4196b89a6ea8d014fe6c8fe6e04aaa7dca927e7ff7f04ffdd34eafcf5"

RPROVIDES:${PN} += "transactional-update-notifier transactional-update-notifier(aarch-64)"
RDEPENDS:${PN} += "/bin/sh dbus-1"

inherit rpm
