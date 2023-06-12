SUMMARY = "Library for sending email"
DESCRIPTION = "Email::Sender replaces the old and sometimes problematic Email::Send \
library, which did a decent job at handling very simple email sending \
tasks, but was not suitable for serious use, for a variety of reasons. \
 \
Most users will be able to use Email::Sender::Simple to send mail. Users \
with more specific needs should look at the available \
Email::Sender::Transport classes. \
 \
Documentation may be found in Email::Sender::Manual, and new users should \
start with Email::Sender::Manual::QuickStart."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.600"

RPM_NAME = "perl-Email-Sender-2.600-1.2.noarch.rpm"
RPM_HASH = "632830f5ac7f92a52664106e28c424c02ebd8ffa595965cd7097eeb3167d9eb581a8ebb0fa76d06e18f00e5822a52b650e2a906f6f86d57b8277e74c519039f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Email::Sender) \
perl(Email::Sender::Failure) \
perl(Email::Sender::Failure::Multi) \
perl(Email::Sender::Failure::Permanent) \
perl(Email::Sender::Failure::Temporary) \
perl(Email::Sender::Manual) \
perl(Email::Sender::Manual::QuickStart) \
perl(Email::Sender::Role::CommonSending) \
perl(Email::Sender::Role::HasMessage) \
perl(Email::Sender::Simple) \
perl(Email::Sender::Success) \
perl(Email::Sender::Success::Partial) \
perl(Email::Sender::Transport) \
perl(Email::Sender::Transport::DevNull) \
perl(Email::Sender::Transport::Failable) \
perl(Email::Sender::Transport::Maildir) \
perl(Email::Sender::Transport::Mbox) \
perl(Email::Sender::Transport::Print) \
perl(Email::Sender::Transport::SMTP) \
perl(Email::Sender::Transport::SMTP::Persistent) \
perl(Email::Sender::Transport::Sendmail) \
perl(Email::Sender::Transport::Test) \
perl(Email::Sender::Transport::Wrapper) \
perl(Email::Sender::Util) \
perl-Email-Sender"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Email::Abstract) \
perl(Email::Address::XS) \
perl(Email::Simple) \
perl(File::Path) \
perl(List::Util) \
perl(Module::Runtime) \
perl(Moo) \
perl(Moo::Role) \
perl(MooX::Types::MooseLike) \
perl(MooX::Types::MooseLike::Base) \
perl(Net::SMTP) \
perl(Sub::Exporter) \
perl(Sub::Exporter::Util) \
perl(Throwable::Error) \
perl(Try::Tiny)"

inherit rpm
