SUMMARY = "Auth against OAuth2 APIs including OpenID Connect"
DESCRIPTION = "This Mojolicious plugin allows you to easily authenticate against a at \
http://oauth.net or at https://openid.net/connect/ provider. It includes \
configurations for a few popular providers, but you can add your own as \
well. \
 \
See register for a full list of bundled providers."
LICENSE = "Artistic-2.0"

PV = "2.02"

RPM_NAME = "perl-Mojolicious-Plugin-OAuth2-2.02-1.7.noarch.rpm"
RPM_HASH = "36f8485dea24f592db9dcade62e355d6f2321bf3de40a4ed32ff8f57e1f02103b72ef8a43d50d3000a608596f2c31b37b791fe163b763183dc6fbbdb6a78bc0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mojolicious::Plugin::OAuth2) perl(Mojolicious::Plugin::OAuth2::Mock) perl-Mojolicious-Plugin-OAuth2"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(IO::Socket::SSL) perl(Mojolicious)"

inherit rpm
