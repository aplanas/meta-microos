SUMMARY = "YaST2 - Country Settings (Language, Keyboard, and Timezone)"
DESCRIPTION = "Country specific data and configuration modules (language, keyboard, \
timezone) for yast2."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-country-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "e551a4b9a61183c98752c635097715fdb7241ede1ffae35890681951bb527b4460632a6b1bed1d8d3b24d216ad99824c99d973f91c339783e698cc63e8fa4100"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Keyboard.desktop) \
application(org.opensuse.yast.Language.desktop) \
application(org.opensuse.yast.Timezone.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Keyboard.metainfo.xml) \
metainfo(org.opensuse.yast.Language.metainfo.xml) \
metainfo(org.opensuse.yast.Timezone.metainfo.xml) \
perl(YaPI::LANGUAGE) \
perl(YaPI::TIME) \
yast2-country \
yast2-country(aarch-64)"
RDEPENDS:${PN} += "rubygem(ruby:3.2.0:ruby-dbus) \
timezone \
yast2 \
yast2-core \
yast2-country-data \
yast2-hardware-detection \
yast2-packager \
yast2-perl-bindings \
yast2-pkg-bindings \
yast2-ruby-bindings \
yast2-trans-stats"

inherit rpm
