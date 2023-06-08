SUMMARY = "Mailutils's incoming e-mail notification daemon"
DESCRIPTION = "Comsatd is the server which receives reports of incoming mail and \
notifies users wishing to get this service."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.15"

RPM_NAME = "mailutils-notify-3.15-2.4.aarch64.rpm"
RPM_HASH = "236696795f72a410d9d235a4dd031fd453d23f0625e85b63dff8b9728fe3a7bcba8d1b9bc735f521ee5e0a353293bde8f26b0b8ba9145a42edd9a09700198864"

RPROVIDES:${PN} += "mailutils-notify mailutils-notify(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmailutils.so.9()(64bit) libmu_dotmail.so.9()(64bit) libmu_imap.so.9()(64bit) libmu_maildir.so.9()(64bit) libmu_mbox.so.9()(64bit) libmu_mh.so.9()(64bit) libmu_pop.so.9()(64bit)"

inherit rpm
