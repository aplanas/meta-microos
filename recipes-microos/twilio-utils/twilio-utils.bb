SUMMARY = "Command line utilities for Twilio users"
DESCRIPTION = "The twilio-utils project contains a few UNIX command-line utilities \
that are handy when working with Twilio: \
 \
* twimsg - Send an outbound SMS message via Twilio \
* twils - List SMS messages from Twilio log \
* twirm - Delete SMS messages from Twilio log \
* twilog - Download Twilio [notifications into syslog \
* twiping - Send SMS ping containing test code \
* smslen - Calculate SMS payload length"
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "twilio-utils-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "d5e3cfcbf630f24f605bd9a036f5e414b6760c0fbf67b9ad41cd39b0488efed83b4f1611d6b0f8cde57a130d8977a12bdf721616da954a5f77c44539e6f3a3b5"

RPROVIDES:${PN} += "config(twilio-utils) twilio-utils twilio-utils(aarch-64)"
RDEPENDS:${PN} += "/bin/bash curl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libxslt-tools php-cli util-linux-systemd xmlstarlet"

inherit rpm
