SUMMARY = "Fast and Simple Mbox Folder Reader"
DESCRIPTION = "This module implements a fast but simple mbox folder reader. One of three \
implementations (Cache, Grep, Perl) will be used depending on the wishes of \
the user and the system configuration. The first implementation is a \
cached-based one which stores email information about mailboxes on the file \
system. Subsequent accesses will be faster because no analysis of the \
mailbox will be needed. The second implementation is one based on GNU grep, \
and is significantly faster than the Perl version for mailboxes which \
contain very large (10MB) emails. The final implementation is a fast \
Perl-based one which should always be applicable. \
 \
The Cache implementation is about 6 times faster than the standard Perl \
implementation. The Grep implementation is about 4 times faster than the \
standard Perl implementation. If you have GNU grep, it's best to enable \
both the Cache and Grep implementations. If the cache information is \
available, you'll get very fast speeds. Otherwise, you'll take about a 1/3 \
performance hit when the Grep version is used instead. \
 \
The overriding requirement for this module is speed. If you wish more \
sophisticated parsing, use Mail::MboxParser (which is based on this module) \
or Mail::Box."
LICENSE = "GPL-2.0-or-later"

PV = "1.5111"

RPM_NAME = "perl-Mail-Mbox-MessageParser-1.5111-1.16.noarch.rpm"
RPM_HASH = "b97671da38b700af2232bbf1f1488fe6c39306699f1304b93523f5a5d02e69969a4e1f0ada558ae91523ca8a234591643b42e0fe21254ff396d5f7c05b32088a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mail::Mbox::MessageParser) perl(Mail::Mbox::MessageParser::Cache) perl(Mail::Mbox::MessageParser::Config) perl(Mail::Mbox::MessageParser::Grep) perl(Mail::Mbox::MessageParser::MetaInfo) perl(Mail::Mbox::MessageParser::Perl) perl-Mail-Mbox-MessageParser"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(FileHandle::Unget)"

inherit rpm
