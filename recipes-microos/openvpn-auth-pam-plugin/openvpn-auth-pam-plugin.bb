SUMMARY = "OpenVPN auth-pam plugin"
DESCRIPTION = "The OpenVPN auth-pam plugin implements username/password authentication \
via PAM, and essentially allows any authentication method supported by \
PAM (such as LDAP, RADIUS, or Linux Shadow passwords) to be used with \
OpenVPN. \
 \
While PAM supports username/password authentication, this can be \
combined with X509 certificates to provide two indepedent levels of \
authentication. \
 \
This plugin uses a split privilege execution model which will function \
even if you drop openvpn daemon privileges using the user, group, or \
chroot directives."
LICENSE = "GPL-2.0-only-WITH-openvpn-openssl-exception"

PV = "2.6.3"

RPM_NAME = "openvpn-auth-pam-plugin-2.6.3-1.1.aarch64.rpm"
RPM_HASH = "6d6b9a0711b5f4d2d590e6cea63e8b253395ca51fd4ec22a15acd34b83d1f578cc101bc511caa07186192b3ffa8c3cfb1e8c5323d62100c6cc1fcb2ac544473e"

RPROVIDES:${PN} += "openvpn-auth-pam-plugin openvpn-auth-pam-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) openvpn"

inherit rpm
