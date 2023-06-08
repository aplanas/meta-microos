SUMMARY = "YaST2 Main Package"
DESCRIPTION = "This package contains scripts and data needed for SUSE Linux \
installation with YaST2"
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "6a45392773869936cf61b2cb5d04f3cf8730ae17bf94531bcb73e480913ab9363a0a1450d6a88ddb00ff87eb0071282477700c33c28129599b7711644c638801"

RPROVIDES:${PN} += "application() application(messages.desktop) application(org.opensuse.yast.Group.Hardware.desktop) application(org.opensuse.yast.Group.HighAvailability.desktop) application(org.opensuse.yast.Group.Misc.desktop) application(org.opensuse.yast.Group.NetworkServices.desktop) application(org.opensuse.yast.Group.Security.desktop) application(org.opensuse.yast.Group.Software.desktop) application(org.opensuse.yast.Group.Support.desktop) application(org.opensuse.yast.Group.System.desktop) application(org.opensuse.yast.Group.Virtualization.desktop) perl(MailTable) perl(MailTable::Aliases) perl(MailTable::PostfixSenderCanonical) perl(MailTable::PostfixVirtual) perl(MailTable::SendmailGenerics) perl(MailTable::SendmailVirtuser) perl(SLPAPI) yast2 yast2(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/perl /usr/bin/touch augeas-lenses coreutils cpio fillup gpg2 hostname rpm rubygem(ruby:3.2.0:abstract_method) rubygem(ruby:3.2.0:cfa) rubygem(ruby:3.2.0:cheetah) rubygem(ruby:3.2.0:nokogiri) rubygem(ruby:3.2.0:simpleidn) sysconfig yast2-core yast2-hardware-detection yast2-logs yast2-perl-bindings yast2-pkg-bindings yast2-ruby-bindings yast2-ycp-ui-bindings yui_backend"

inherit rpm
