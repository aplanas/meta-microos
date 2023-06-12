SUMMARY = "Repository mirroring tool and registration proxy for SCC"
DESCRIPTION = "This package provides a mirroring tool for RPM repositories and a registration \
proxy for the SUSE Customer Center (SCC). \
 \
As registration is required for SUSE products, the registration proxy allows \
one to register SUSE products within a private network. \
 \
It's possible to mirror SUSE, as well as openSUSE and other RPM repositories. \
SCC organization credentials are required to synchronize SUSE products, \
subscription information, and to mirror SUSE repositories. \
 \
RMT supersedes the main functionality of SMT in SLES 15."
LICENSE = "GPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "rmt-server-2.13-1.1.aarch64.rpm"
RPM_HASH = "db451a2e74e2a167fe8dbbec253df1737aff7fc20011d9695a49669fe3556d9694a49ef8e65d232e26e0059cf5f5a64cf891cda4f76837f46dd0b155d01c4277"

RPROVIDES:${PN} += "bundled(rubygem(actionpack)) \
bundled(rubygem(actionview)) \
bundled(rubygem(active_model_serializers)) \
bundled(rubygem(activemodel)) \
bundled(rubygem(activerecord)) \
bundled(rubygem(activesupport)) \
bundled(rubygem(builder)) \
bundled(rubygem(case_transform)) \
bundled(rubygem(concurrent-ruby)) \
bundled(rubygem(config)) \
bundled(rubygem(crass)) \
bundled(rubygem(deep_merge)) \
bundled(rubygem(dry-configurable)) \
bundled(rubygem(dry-container)) \
bundled(rubygem(dry-core)) \
bundled(rubygem(dry-equalizer)) \
bundled(rubygem(dry-inflector)) \
bundled(rubygem(dry-initializer)) \
bundled(rubygem(dry-logic)) \
bundled(rubygem(dry-schema)) \
bundled(rubygem(dry-types)) \
bundled(rubygem(dry-validation)) \
bundled(rubygem(erubi)) \
bundled(rubygem(ethon)) \
bundled(rubygem(fast_gettext)) \
bundled(rubygem(ffi)) \
bundled(rubygem(gettext_i18n_rails)) \
bundled(rubygem(i18n)) \
bundled(rubygem(jsonapi-renderer)) \
bundled(rubygem(jwt)) \
bundled(rubygem(loofah)) \
bundled(rubygem(method_source)) \
bundled(rubygem(mini_portile2)) \
bundled(rubygem(minitest)) \
bundled(rubygem(mysql2)) \
bundled(rubygem(nio4r)) \
bundled(rubygem(nokogiri)) \
bundled(rubygem(puma)) \
bundled(rubygem(rack)) \
bundled(rubygem(rack-test)) \
bundled(rubygem(rails-dom-testing)) \
bundled(rubygem(rails-html-sanitizer)) \
bundled(rubygem(railties)) \
bundled(rubygem(rake)) \
bundled(rubygem(repomd_parser)) \
bundled(rubygem(responders)) \
bundled(rubygem(terminal-table)) \
bundled(rubygem(thor)) \
bundled(rubygem(typhoeus)) \
bundled(rubygem(tzinfo)) \
bundled(rubygem(unicode-display_width)) \
bundled(rubygem(versionist)) \
bundled(rubygem(yard)) \
bundled(rubygem(zeitwerk)) \
config(rmt-server) \
rmt-server \
rmt-server(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/ruby.ruby3.2 \
gpg2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libexslt.so.0()(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libm.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libruby3.2.so.3.2()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.5.8)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.12)(64bit) \
libxml2.so.2(LIBXML2_2.6.15)(64bit) \
libxml2.so.2(LIBXML2_2.6.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.20)(64bit) \
libxml2.so.2(LIBXML2_2.6.21)(64bit) \
libxml2.so.2(LIBXML2_2.6.23)(64bit) \
libxml2.so.2(LIBXML2_2.6.24)(64bit) \
libxml2.so.2(LIBXML2_2.6.3)(64bit) \
libxml2.so.2(LIBXML2_2.6.8)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.13)(64bit) \
libxslt.so.1(LIBXML2_1.0.18)(64bit) \
libxslt.so.1(LIBXML2_1.0.24)(64bit) \
libz.so.1()(64bit) \
rmt-server-configuration \
ruby3.2 \
ruby3.2-rubygem-bundler \
shadow \
timezone \
util-linux"

inherit rpm
