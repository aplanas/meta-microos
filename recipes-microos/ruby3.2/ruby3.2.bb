SUMMARY = "An Interpreted Object-Oriented Scripting Language"
DESCRIPTION = "Ruby is an interpreted scripting language for object-oriented programming. It \
has many features for processing text files and performing system management \
tasks (as in Perl).  It is extensible. \
 \
* Ruby features: \
 \
- Simple Syntax \
 \
- *Normal* Object-Oriented features (class, method calls, for \
   example) \
 \
- *Advanced* Object-Oriented features(Mix-in, Singleton-method, for \
   example) \
 \
- Operator Overloading \
 \
- Exception Handling \
 \
- Iterators and Closures \
 \
- Garbage Collection \
 \
- Dynamic Loading of Object Files (on some architectures)"
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "ruby3.2-3.2.2-1.1.aarch64.rpm"
RPM_HASH = "91d6a880bdfecec18f9a9954c0dc80c26cc4a31308d2e909a93be6e8d6883d8af7b9f2f06ea495645f48b6af4c57cab1e5cf7981e5f19a9584bc7f6ac77d303f"

RPROVIDES:${PN} += "rpm_macro(rb_build_ruby_abis) rpm_macro(rb_build_versions) rpm_macro(rb_default_ruby) rpm_macro(rb_default_ruby_abi) rpm_macro(rb_default_ruby_suffix) rpm_macro(rubydevelruby32) rpm_macro(rubydevelxruby32) rpm_macro(rubygemsruby32) rpm_macro(rubygemsxruby32) rpm_macro(rubyruby32) rpm_macro(rubyxruby32) ruby(abi) ruby-default ruby3.2 ruby3.2(aarch-64) ruby3.2-stdlib ruby32 rubygem(abbrev) rubygem(base64) rubygem(benchmark) rubygem(bigdecimal) rubygem(bundler) rubygem(cgi) rubygem(csv) rubygem(date) rubygem(debug) rubygem(delegate) rubygem(did_you_mean) rubygem(digest) rubygem(drb) rubygem(english) rubygem(erb) rubygem(error_highlight) rubygem(etc) rubygem(fcntl) rubygem(fiddle) rubygem(fileutils) rubygem(find) rubygem(forwardable) rubygem(getoptlong) rubygem(io-console) rubygem(io-nonblock) rubygem(io-wait) rubygem(ipaddr) rubygem(irb) rubygem(json) rubygem(logger) rubygem(matrix) rubygem(minitest) rubygem(mutex_m) rubygem(net-ftp) rubygem(net-http) rubygem(net-imap) rubygem(net-pop) rubygem(net-protocol) rubygem(net-smtp) rubygem(nkf) rubygem(observer) rubygem(open-uri) rubygem(open3) rubygem(openssl) rubygem(optparse) rubygem(ostruct) rubygem(pathname) rubygem(power_assert) rubygem(pp) rubygem(prettyprint) rubygem(prime) rubygem(pstore) rubygem(psych) rubygem(racc) rubygem(rake) rubygem(rbs) rubygem(rdoc) rubygem(readline) rubygem(readline-ext) rubygem(reline) rubygem(resolv) rubygem(resolv-replace) rubygem(rexml) rubygem(rinda) rubygem(rss) rubygem(ruby2_keywords) rubygem(ruby:3.2.0:abbrev) rubygem(ruby:3.2.0:abbrev:0) rubygem(ruby:3.2.0:abbrev:0.1) rubygem(ruby:3.2.0:abbrev:0.1.1) rubygem(ruby:3.2.0:base64) rubygem(ruby:3.2.0:base64:0) rubygem(ruby:3.2.0:base64:0.1) rubygem(ruby:3.2.0:base64:0.1.1) rubygem(ruby:3.2.0:benchmark) rubygem(ruby:3.2.0:benchmark:0) rubygem(ruby:3.2.0:benchmark:0.2) rubygem(ruby:3.2.0:benchmark:0.2.1) rubygem(ruby:3.2.0:bigdecimal) rubygem(ruby:3.2.0:bigdecimal:3) rubygem(ruby:3.2.0:bigdecimal:3.1) rubygem(ruby:3.2.0:bigdecimal:3.1.3) rubygem(ruby:3.2.0:bundler) rubygem(ruby:3.2.0:bundler:2) rubygem(ruby:3.2.0:bundler:2.4) rubygem(ruby:3.2.0:bundler:2.4.10) rubygem(ruby:3.2.0:cgi) rubygem(ruby:3.2.0:cgi:0) rubygem(ruby:3.2.0:cgi:0.3) rubygem(ruby:3.2.0:cgi:0.3.6) rubygem(ruby:3.2.0:csv) rubygem(ruby:3.2.0:csv:3) rubygem(ruby:3.2.0:csv:3.2) rubygem(ruby:3.2.0:csv:3.2.6) rubygem(ruby:3.2.0:date) rubygem(ruby:3.2.0:date:3) rubygem(ruby:3.2.0:date:3.3) rubygem(ruby:3.2.0:date:3.3.3) rubygem(ruby:3.2.0:debug) rubygem(ruby:3.2.0:debug:1) rubygem(ruby:3.2.0:debug:1.7) rubygem(ruby:3.2.0:debug:1.7.1) rubygem(ruby:3.2.0:delegate) rubygem(ruby:3.2.0:delegate:0) rubygem(ruby:3.2.0:delegate:0.3) rubygem(ruby:3.2.0:delegate:0.3.0) rubygem(ruby:3.2.0:did_you_mean) rubygem(ruby:3.2.0:did_you_mean:1) rubygem(ruby:3.2.0:did_you_mean:1.6) rubygem(ruby:3.2.0:did_you_mean:1.6.3) rubygem(ruby:3.2.0:digest) rubygem(ruby:3.2.0:digest:3) rubygem(ruby:3.2.0:digest:3.1) rubygem(ruby:3.2.0:digest:3.1.1) rubygem(ruby:3.2.0:drb) rubygem(ruby:3.2.0:drb:2) rubygem(ruby:3.2.0:drb:2.1) rubygem(ruby:3.2.0:drb:2.1.1) rubygem(ruby:3.2.0:english) rubygem(ruby:3.2.0:english:0) rubygem(ruby:3.2.0:english:0.7) rubygem(ruby:3.2.0:english:0.7.2) rubygem(ruby:3.2.0:erb) rubygem(ruby:3.2.0:erb:4) rubygem(ruby:3.2.0:erb:4.0) rubygem(ruby:3.2.0:erb:4.0.2) rubygem(ruby:3.2.0:error_highlight) rubygem(ruby:3.2.0:error_highlight:0) rubygem(ruby:3.2.0:error_highlight:0.5) rubygem(ruby:3.2.0:error_highlight:0.5.1) rubygem(ruby:3.2.0:etc) rubygem(ruby:3.2.0:etc:1) rubygem(ruby:3.2.0:etc:1.4) rubygem(ruby:3.2.0:etc:1.4.2) rubygem(ruby:3.2.0:fcntl) rubygem(ruby:3.2.0:fcntl:1) rubygem(ruby:3.2.0:fcntl:1.0) rubygem(ruby:3.2.0:fcntl:1.0.2) rubygem(ruby:3.2.0:fiddle) rubygem(ruby:3.2.0:fiddle:1) rubygem(ruby:3.2.0:fiddle:1.1) rubygem(ruby:3.2.0:fiddle:1.1.1) rubygem(ruby:3.2.0:fileutils) rubygem(ruby:3.2.0:fileutils:1) rubygem(ruby:3.2.0:fileutils:1.7) rubygem(ruby:3.2.0:fileutils:1.7.0) rubygem(ruby:3.2.0:find) rubygem(ruby:3.2.0:find:0) rubygem(ruby:3.2.0:find:0.1) rubygem(ruby:3.2.0:find:0.1.1) rubygem(ruby:3.2.0:forwardable) rubygem(ruby:3.2.0:forwardable:1) rubygem(ruby:3.2.0:forwardable:1.3) rubygem(ruby:3.2.0:forwardable:1.3.3) rubygem(ruby:3.2.0:getoptlong) rubygem(ruby:3.2.0:getoptlong:0) rubygem(ruby:3.2.0:getoptlong:0.2) rubygem(ruby:3.2.0:getoptlong:0.2.0) rubygem(ruby:3.2.0:io-console) rubygem(ruby:3.2.0:io-console:0) rubygem(ruby:3.2.0:io-console:0.6) rubygem(ruby:3.2.0:io-console:0.6.0) rubygem(ruby:3.2.0:io-nonblock) rubygem(ruby:3.2.0:io-nonblock:0) rubygem(ruby:3.2.0:io-nonblock:0.2) rubygem(ruby:3.2.0:io-nonblock:0.2.0) rubygem(ruby:3.2.0:io-wait) rubygem(ruby:3.2.0:io-wait:0) rubygem(ruby:3.2.0:io-wait:0.3) rubygem(ruby:3.2.0:io-wait:0.3.0) rubygem(ruby:3.2.0:ipaddr) rubygem(ruby:3.2.0:ipaddr:1) rubygem(ruby:3.2.0:ipaddr:1.2) rubygem(ruby:3.2.0:ipaddr:1.2.5) rubygem(ruby:3.2.0:irb) rubygem(ruby:3.2.0:irb:1) rubygem(ruby:3.2.0:irb:1.6) rubygem(ruby:3.2.0:irb:1.6.2) rubygem(ruby:3.2.0:json) rubygem(ruby:3.2.0:json:2) rubygem(ruby:3.2.0:json:2.6) rubygem(ruby:3.2.0:json:2.6.3) rubygem(ruby:3.2.0:logger) rubygem(ruby:3.2.0:logger:1) rubygem(ruby:3.2.0:logger:1.5) rubygem(ruby:3.2.0:logger:1.5.3) rubygem(ruby:3.2.0:matrix) rubygem(ruby:3.2.0:matrix:0) rubygem(ruby:3.2.0:matrix:0.4) rubygem(ruby:3.2.0:matrix:0.4.2) rubygem(ruby:3.2.0:minitest) rubygem(ruby:3.2.0:minitest:5) rubygem(ruby:3.2.0:minitest:5.16) rubygem(ruby:3.2.0:minitest:5.16.3) rubygem(ruby:3.2.0:mutex_m) rubygem(ruby:3.2.0:mutex_m:0) rubygem(ruby:3.2.0:mutex_m:0.1) rubygem(ruby:3.2.0:mutex_m:0.1.2) rubygem(ruby:3.2.0:net-ftp) rubygem(ruby:3.2.0:net-ftp:0) rubygem(ruby:3.2.0:net-ftp:0.2) rubygem(ruby:3.2.0:net-ftp:0.2.0) rubygem(ruby:3.2.0:net-http) rubygem(ruby:3.2.0:net-http:0) rubygem(ruby:3.2.0:net-http:0.3) rubygem(ruby:3.2.0:net-http:0.3.2) rubygem(ruby:3.2.0:net-imap) rubygem(ruby:3.2.0:net-imap:0) rubygem(ruby:3.2.0:net-imap:0.3) rubygem(ruby:3.2.0:net-imap:0.3.4) rubygem(ruby:3.2.0:net-pop) rubygem(ruby:3.2.0:net-pop:0) rubygem(ruby:3.2.0:net-pop:0.1) rubygem(ruby:3.2.0:net-pop:0.1.2) rubygem(ruby:3.2.0:net-protocol) rubygem(ruby:3.2.0:net-protocol:0) rubygem(ruby:3.2.0:net-protocol:0.2) rubygem(ruby:3.2.0:net-protocol:0.2.1) rubygem(ruby:3.2.0:net-smtp) rubygem(ruby:3.2.0:net-smtp:0) rubygem(ruby:3.2.0:net-smtp:0.3) rubygem(ruby:3.2.0:net-smtp:0.3.3) rubygem(ruby:3.2.0:nkf) rubygem(ruby:3.2.0:nkf:0) rubygem(ruby:3.2.0:nkf:0.1) rubygem(ruby:3.2.0:nkf:0.1.2) rubygem(ruby:3.2.0:observer) rubygem(ruby:3.2.0:observer:0) rubygem(ruby:3.2.0:observer:0.1) rubygem(ruby:3.2.0:observer:0.1.1) rubygem(ruby:3.2.0:open-uri) rubygem(ruby:3.2.0:open-uri:0) rubygem(ruby:3.2.0:open-uri:0.3) rubygem(ruby:3.2.0:open-uri:0.3.0) rubygem(ruby:3.2.0:open3) rubygem(ruby:3.2.0:open3:0) rubygem(ruby:3.2.0:open3:0.1) rubygem(ruby:3.2.0:open3:0.1.2) rubygem(ruby:3.2.0:openssl) rubygem(ruby:3.2.0:openssl:3) rubygem(ruby:3.2.0:openssl:3.1) rubygem(ruby:3.2.0:openssl:3.1.0) rubygem(ruby:3.2.0:optparse) rubygem(ruby:3.2.0:optparse:0) rubygem(ruby:3.2.0:optparse:0.3) rubygem(ruby:3.2.0:optparse:0.3.1) rubygem(ruby:3.2.0:ostruct) rubygem(ruby:3.2.0:ostruct:0) rubygem(ruby:3.2.0:ostruct:0.5) rubygem(ruby:3.2.0:ostruct:0.5.5) rubygem(ruby:3.2.0:pathname) rubygem(ruby:3.2.0:pathname:0) rubygem(ruby:3.2.0:pathname:0.2) rubygem(ruby:3.2.0:pathname:0.2.1) rubygem(ruby:3.2.0:power_assert) rubygem(ruby:3.2.0:power_assert:2) rubygem(ruby:3.2.0:power_assert:2.0) rubygem(ruby:3.2.0:power_assert:2.0.3) rubygem(ruby:3.2.0:pp) rubygem(ruby:3.2.0:pp:0) rubygem(ruby:3.2.0:pp:0.4) rubygem(ruby:3.2.0:pp:0.4.0) rubygem(ruby:3.2.0:prettyprint) rubygem(ruby:3.2.0:prettyprint:0) rubygem(ruby:3.2.0:prettyprint:0.1) rubygem(ruby:3.2.0:prettyprint:0.1.1) rubygem(ruby:3.2.0:prime) rubygem(ruby:3.2.0:prime:0) rubygem(ruby:3.2.0:prime:0.1) rubygem(ruby:3.2.0:prime:0.1.2) rubygem(ruby:3.2.0:pstore) rubygem(ruby:3.2.0:pstore:0) rubygem(ruby:3.2.0:pstore:0.1) rubygem(ruby:3.2.0:pstore:0.1.2) rubygem(ruby:3.2.0:psych) rubygem(ruby:3.2.0:psych:5) rubygem(ruby:3.2.0:psych:5.0) rubygem(ruby:3.2.0:psych:5.0.1) rubygem(ruby:3.2.0:racc) rubygem(ruby:3.2.0:racc:1) rubygem(ruby:3.2.0:racc:1.6) rubygem(ruby:3.2.0:racc:1.6.2) rubygem(ruby:3.2.0:rake) rubygem(ruby:3.2.0:rake:13) rubygem(ruby:3.2.0:rake:13.0) rubygem(ruby:3.2.0:rake:13.0.6) rubygem(ruby:3.2.0:rbs) rubygem(ruby:3.2.0:rbs:2) rubygem(ruby:3.2.0:rbs:2.8) rubygem(ruby:3.2.0:rbs:2.8.2) rubygem(ruby:3.2.0:rdoc) rubygem(ruby:3.2.0:rdoc:6) rubygem(ruby:3.2.0:rdoc:6.5) rubygem(ruby:3.2.0:rdoc:6.5.0) rubygem(ruby:3.2.0:readline) rubygem(ruby:3.2.0:readline-ext) rubygem(ruby:3.2.0:readline-ext:0) rubygem(ruby:3.2.0:readline-ext:0.1) rubygem(ruby:3.2.0:readline-ext:0.1.5) rubygem(ruby:3.2.0:readline:0) rubygem(ruby:3.2.0:readline:0.0) rubygem(ruby:3.2.0:readline:0.0.3) rubygem(ruby:3.2.0:reline) rubygem(ruby:3.2.0:reline:0) rubygem(ruby:3.2.0:reline:0.3) rubygem(ruby:3.2.0:reline:0.3.2) rubygem(ruby:3.2.0:resolv) rubygem(ruby:3.2.0:resolv-replace) rubygem(ruby:3.2.0:resolv-replace:0) rubygem(ruby:3.2.0:resolv-replace:0.1) rubygem(ruby:3.2.0:resolv-replace:0.1.1) rubygem(ruby:3.2.0:resolv:0) rubygem(ruby:3.2.0:resolv:0.2) rubygem(ruby:3.2.0:resolv:0.2.2) rubygem(ruby:3.2.0:rexml) rubygem(ruby:3.2.0:rexml:3) rubygem(ruby:3.2.0:rexml:3.2) rubygem(ruby:3.2.0:rexml:3.2.5) rubygem(ruby:3.2.0:rinda) rubygem(ruby:3.2.0:rinda:0) rubygem(ruby:3.2.0:rinda:0.1) rubygem(ruby:3.2.0:rinda:0.1.1) rubygem(ruby:3.2.0:rss) rubygem(ruby:3.2.0:rss:0) rubygem(ruby:3.2.0:rss:0.2) rubygem(ruby:3.2.0:rss:0.2.9) rubygem(ruby:3.2.0:ruby2_keywords) rubygem(ruby:3.2.0:ruby2_keywords:0) rubygem(ruby:3.2.0:ruby2_keywords:0.0) rubygem(ruby:3.2.0:ruby2_keywords:0.0.5) rubygem(ruby:3.2.0:securerandom) rubygem(ruby:3.2.0:securerandom:0) rubygem(ruby:3.2.0:securerandom:0.2) rubygem(ruby:3.2.0:securerandom:0.2.2) rubygem(ruby:3.2.0:set) rubygem(ruby:3.2.0:set:1) rubygem(ruby:3.2.0:set:1.0) rubygem(ruby:3.2.0:set:1.0.3) rubygem(ruby:3.2.0:shellwords) rubygem(ruby:3.2.0:shellwords:0) rubygem(ruby:3.2.0:shellwords:0.1) rubygem(ruby:3.2.0:shellwords:0.1.0) rubygem(ruby:3.2.0:singleton) rubygem(ruby:3.2.0:singleton:0) rubygem(ruby:3.2.0:singleton:0.1) rubygem(ruby:3.2.0:singleton:0.1.1) rubygem(ruby:3.2.0:stringio) rubygem(ruby:3.2.0:stringio:3) rubygem(ruby:3.2.0:stringio:3.0) rubygem(ruby:3.2.0:stringio:3.0.4) rubygem(ruby:3.2.0:strscan) rubygem(ruby:3.2.0:strscan:3) rubygem(ruby:3.2.0:strscan:3.0) rubygem(ruby:3.2.0:strscan:3.0.5) rubygem(ruby:3.2.0:syntax_suggest) rubygem(ruby:3.2.0:syntax_suggest:1) rubygem(ruby:3.2.0:syntax_suggest:1.0) rubygem(ruby:3.2.0:syntax_suggest:1.0.2) rubygem(ruby:3.2.0:syslog) rubygem(ruby:3.2.0:syslog:0) rubygem(ruby:3.2.0:syslog:0.1) rubygem(ruby:3.2.0:syslog:0.1.1) rubygem(ruby:3.2.0:tempfile) rubygem(ruby:3.2.0:tempfile:0) rubygem(ruby:3.2.0:tempfile:0.1) rubygem(ruby:3.2.0:tempfile:0.1.3) rubygem(ruby:3.2.0:test-unit) rubygem(ruby:3.2.0:test-unit:3) rubygem(ruby:3.2.0:test-unit:3.5) rubygem(ruby:3.2.0:test-unit:3.5.7) rubygem(ruby:3.2.0:time) rubygem(ruby:3.2.0:time:0) rubygem(ruby:3.2.0:time:0.2) rubygem(ruby:3.2.0:time:0.2.2) rubygem(ruby:3.2.0:timeout) rubygem(ruby:3.2.0:timeout:0) rubygem(ruby:3.2.0:timeout:0.3) rubygem(ruby:3.2.0:timeout:0.3.1) rubygem(ruby:3.2.0:tmpdir) rubygem(ruby:3.2.0:tmpdir:0) rubygem(ruby:3.2.0:tmpdir:0.1) rubygem(ruby:3.2.0:tmpdir:0.1.3) rubygem(ruby:3.2.0:tsort) rubygem(ruby:3.2.0:tsort:0) rubygem(ruby:3.2.0:tsort:0.1) rubygem(ruby:3.2.0:tsort:0.1.1) rubygem(ruby:3.2.0:typeprof) rubygem(ruby:3.2.0:typeprof:0) rubygem(ruby:3.2.0:typeprof:0.21) rubygem(ruby:3.2.0:typeprof:0.21.3) rubygem(ruby:3.2.0:un) rubygem(ruby:3.2.0:un:0) rubygem(ruby:3.2.0:un:0.2) rubygem(ruby:3.2.0:un:0.2.1) rubygem(ruby:3.2.0:uri) rubygem(ruby:3.2.0:uri:0) rubygem(ruby:3.2.0:uri:0.12) rubygem(ruby:3.2.0:uri:0.12.1) rubygem(ruby:3.2.0:weakref) rubygem(ruby:3.2.0:weakref:0) rubygem(ruby:3.2.0:weakref:0.1) rubygem(ruby:3.2.0:weakref:0.1.2) rubygem(ruby:3.2.0:yaml) rubygem(ruby:3.2.0:yaml:0) rubygem(ruby:3.2.0:yaml:0.2) rubygem(ruby:3.2.0:yaml:0.2.1) rubygem(ruby:3.2.0:zlib) rubygem(ruby:3.2.0:zlib:3) rubygem(ruby:3.2.0:zlib:3.0) rubygem(ruby:3.2.0:zlib:3.0.0) rubygem(securerandom) rubygem(set) rubygem(shellwords) rubygem(singleton) rubygem(stringio) rubygem(strscan) rubygem(syntax_suggest) rubygem(syslog) rubygem(tempfile) rubygem(test-unit) rubygem(time) rubygem(timeout) rubygem(tmpdir) rubygem(tsort) rubygem(typeprof) rubygem(un) rubygem(uri) rubygem(weakref) rubygem(yaml) rubygem(zlib)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libncurses.so.6()(64bit) libreadline.so.8()(64bit) libruby3.2.so.3.2()(64bit) libruby3_2-3_2 libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libyaml-0.so.2()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.2)(64bit) libz.so.1(ZLIB_1.2.9)(64bit) ruby-common update-alternatives"

inherit rpm
