SUMMARY = "Engine for tidyall, your all-in-one code tidier and validator"
DESCRIPTION = "This is the engine used by tidyall - read that first to get an overview. \
 \
You can call this API from your own program instead of executing 'tidyall'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.83"

RPM_NAME = "perl-Code-TidyAll-0.83-1.2.noarch.rpm"
RPM_HASH = "493ea576d5ad3c4b3df67f8b27a95895af90bd3bbe719f54bbb3a1b250c24ac17db4172a1ccad4b1ac00f6f9e76caa5ba02c26c939f89fc98e505c1b64f04a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Code::TidyAll) \
perl(Code::TidyAll::Cache) \
perl(Code::TidyAll::CacheModel) \
perl(Code::TidyAll::CacheModel::Shared) \
perl(Code::TidyAll::Config::INI::Reader) \
perl(Code::TidyAll::Git::Precommit) \
perl(Code::TidyAll::Git::Prereceive) \
perl(Code::TidyAll::Git::Util) \
perl(Code::TidyAll::Plugin) \
perl(Code::TidyAll::Plugin::CSSUnminifier) \
perl(Code::TidyAll::Plugin::GenericTransformer) \
perl(Code::TidyAll::Plugin::GenericValidator) \
perl(Code::TidyAll::Plugin::JSBeautify) \
perl(Code::TidyAll::Plugin::JSHint) \
perl(Code::TidyAll::Plugin::JSLint) \
perl(Code::TidyAll::Plugin::JSON) \
perl(Code::TidyAll::Plugin::MasonTidy) \
perl(Code::TidyAll::Plugin::PHPCodeSniffer) \
perl(Code::TidyAll::Plugin::PerlCritic) \
perl(Code::TidyAll::Plugin::PerlTidy) \
perl(Code::TidyAll::Plugin::PerlTidySweet) \
perl(Code::TidyAll::Plugin::PodChecker) \
perl(Code::TidyAll::Plugin::PodSpell) \
perl(Code::TidyAll::Plugin::PodTidy) \
perl(Code::TidyAll::Plugin::SortLines) \
perl(Code::TidyAll::Result) \
perl(Code::TidyAll::Role::GenericExecutable) \
perl(Code::TidyAll::Role::HasIgnore) \
perl(Code::TidyAll::Role::RunsCommand) \
perl(Code::TidyAll::Role::Tempdir) \
perl(Code::TidyAll::SVN::Precommit) \
perl(Code::TidyAll::SVN::Util) \
perl(Code::TidyAll::Util) \
perl(Code::TidyAll::Util::Zglob) \
perl(Code::TidyAll::Zglob) \
perl(Test::Code::TidyAll) \
perl-Code-TidyAll"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Capture::Tiny) \
perl(Config::INI::Reader) \
perl(Date::Format) \
perl(Digest::SHA) \
perl(File::Which) \
perl(File::pushd) \
perl(IPC::Run3) \
perl(IPC::System::Simple) \
perl(List::Compare) \
perl(List::SomeUtils) \
perl(Log::Any) \
perl(Module::Runtime) \
perl(Moo) \
perl(Moo::Role) \
perl(Path::Tiny) \
perl(Scope::Guard) \
perl(Specio) \
perl(Specio::Declare) \
perl(Specio::Library::Builtins) \
perl(Specio::Library::Numeric) \
perl(Specio::Library::Path::Tiny) \
perl(Specio::Library::String) \
perl(Text::Diff) \
perl(Text::Diff::Table) \
perl(Time::Duration::Parse) \
perl(Try::Tiny)"

inherit rpm
