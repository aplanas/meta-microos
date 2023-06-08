SUMMARY = "'Off The Record' end-to-end encryption plugin for Pidgin"
DESCRIPTION = "This is a Pidgin plugin which implements Off-the-Record (OTR) \
Messaging. OTR allows you to have private conversations over IM by \
providing: \
 * Encryption. \
 * No one else can read your instant messages. \
 * Authentication. \
 * You are assured the correspondent is who you think it is. \
 * Deniability. \
 * The messages you send do not have digital signatures that are \
   checkable by a third party. Anyone can forge messages after a \
   conversation to make them look like they came from you. \
   However, during a conversation, your correspondent is assured \
   the messages he sees are authentic and unmodified. \
 * Perfect forward secrecy. \
 * If you lose control of your private keys, no previous \
   conversation is compromised."
LICENSE = "GPL-2.0+"

PV = "4.0.2"

RPM_NAME = "pidgin-plugin-otr-4.0.2-3.25.aarch64.rpm"
RPM_HASH = "3130934e760f90cf787bf3891e87b2f321f9ad24802c653b96778518e5d572bef7a5eb1ac486ba8cb34027a5e552fe81d83a7aeaaa526ec61d22b7d299f6742c"

RPROVIDES:${PN} += "metainfo() metainfo(pidgin-otr.metainfo.xml) pidgin-otr pidgin-plugin-otr pidgin-plugin-otr(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libotr.so.5()(64bit) pidgin"

inherit rpm
