SUMMARY = "An integrated web browser, composer, mail/news client, and IRC client"
DESCRIPTION = "SeaMonkey is an all-in-one Internet application suite containing a web \
browser, an e-mail and newsgroup client with an included web feed \
reader and calendar, an HTML editor and web development tools, and an \
IRC client.  SeaMonkey is a successor to the popular Netscape \
Communicator and Mozilla Application Suite, and (unlike its siblings, \
Firefox and Thunderbird) retains Mozilla's more traditional-looking \
interface.  Many Thunderbird and (legacy) Firefox extensions are \
compatible with SeaMonkey."
LICENSE = "MPL-2.0"

PV = "2.53.16"

RPM_NAME = "seamonkey-2.53.16-1.2.aarch64.rpm"
RPM_HASH = "5dc634cc848c19d23db5026538a6ed62db5bb5bba602fb03e10617b44ad752d99949b2ae56cfb41aadb8e50032e02ebbc4486d67a4c84b23bff7775e74677280"

RPROVIDES:${PN} += "application() \
application(seamonkey-composer.desktop) \
application(seamonkey-mail.desktop) \
application(seamonkey.desktop) \
browser(npapi) \
locale(seamonkey:cs;de;el;en_GB;es_AR;es_ES;fi;fr;hu;it;ja;ka;nb_NO;nl;pl;pt_BR;pt_PT;ru;sk;sv_SE;zh_CN;zh_TW) \
metainfo() \
metainfo(seamonkey-composer.appdata.xml) \
metainfo(seamonkey-mail.appdata.xml) \
metainfo(seamonkey.appdata.xml) \
mimehandler(application/xhtml+xml) \
mimehandler(text/html) \
mimehandler(x-scheme-handler/http) \
mimehandler(x-scheme-handler/https) \
mimehandler(x-scheme-handler/mailto) \
seamonkey \
seamonkey(aarch-64) \
seamonkey-mail \
seamonkey-spellchecker \
seamonkey-translations-common \
seamonkey-translations-other \
seamonkey-venkman \
web_browser"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXcursor.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXrender.so.1()(64bit) \
libXt.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgthread-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libicudata.so.73()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.10)(64bit) \
libnss3.so(NSS_3.10.2)(64bit) \
libnss3.so(NSS_3.11)(64bit) \
libnss3.so(NSS_3.11.2)(64bit) \
libnss3.so(NSS_3.12)(64bit) \
libnss3.so(NSS_3.12.3)(64bit) \
libnss3.so(NSS_3.12.4)(64bit) \
libnss3.so(NSS_3.12.9)(64bit) \
libnss3.so(NSS_3.13)(64bit) \
libnss3.so(NSS_3.15)(64bit) \
libnss3.so(NSS_3.16.1)(64bit) \
libnss3.so(NSS_3.16.2)(64bit) \
libnss3.so(NSS_3.19)(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.21)(64bit) \
libnss3.so(NSS_3.22)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.30)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.5)(64bit) \
libnss3.so(NSS_3.6)(64bit) \
libnss3.so(NSS_3.7)(64bit) \
libnss3.so(NSS_3.79)(64bit) \
libnss3.so(NSS_3.8)(64bit) \
libnss3.so(NSS_3.9)(64bit) \
libnss3.so(NSS_3.9.2)(64bit) \
libnss3.so(NSS_3.9.3)(64bit) \
libnssutil3.so()(64bit) \
libnssutil3.so(NSSUTIL_3.12)(64bit) \
libnssutil3.so(NSSUTIL_3.12.3)(64bit) \
libnssutil3.so(NSSUTIL_3.12.5)(64bit) \
libnssutil3.so(NSSUTIL_3.13)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libplc4.so()(64bit) \
libplds4.so()(64bit) \
libproxy.so.1()(64bit) \
libproxy.so.1(LIBPROXY_0.4.16)(64bit) \
libsharpyuv.so.0()(64bit) \
libsmime3.so()(64bit) \
libsmime3.so(NSS_3.13)(64bit) \
libsmime3.so(NSS_3.16)(64bit) \
libsmime3.so(NSS_3.2)(64bit) \
libsmime3.so(NSS_3.4)(64bit) \
libsmime3.so(NSS_3.4.1)(64bit) \
libsmime3.so(NSS_3.6)(64bit) \
libssl3.so()(64bit) \
libssl3.so(NSS_3.12.6)(64bit) \
libssl3.so(NSS_3.13)(64bit) \
libssl3.so(NSS_3.13.2)(64bit) \
libssl3.so(NSS_3.14)(64bit) \
libssl3.so(NSS_3.15)(64bit) \
libssl3.so(NSS_3.15.4)(64bit) \
libssl3.so(NSS_3.2)(64bit) \
libssl3.so(NSS_3.21)(64bit) \
libssl3.so(NSS_3.22)(64bit) \
libssl3.so(NSS_3.23)(64bit) \
libssl3.so(NSS_3.27)(64bit) \
libssl3.so(NSS_3.28)(64bit) \
libssl3.so(NSS_3.4)(64bit) \
libstartup-notification-1.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb.so.1()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libz.so.1(ZLIB_1.2.3.4)(64bit) \
libz.so.1(ZLIB_1.2.9)(64bit) \
mozilla-nspr \
mozilla-nss"

inherit rpm
