SUMMARY = "API wrapper around the 'tar' utility"
DESCRIPTION = "*Archive::Tar::Wrapper* is an API wrapper around the 'tar' command line \
program. It never stores anything in memory, but works on temporary \
directory structures on disk instead. It provides a mapping between the \
logical paths in the tarball and the 'real' files in the temporary \
directory on disk. \
 \
It differs from Archive::Tar in two ways: \
 \
  * *Archive::Tar::Wrapper* almost doesn't hold anything in memory (see 'write' \
method), instead using disk as storage. \
 \
  * *Archive::Tar::Wrapper* is 100% compliant with the platform's 'tar' utility \
because it uses it internally."
LICENSE = "GPL-3.0-or-later"

PV = "0.38"

RPM_NAME = "perl-Archive-Tar-Wrapper-0.38-1.12.noarch.rpm"
RPM_HASH = "4134bbf5bf29c982ee08599813be91cc17b50aec453e49c5785fa3316005a1665bca278d5c621346527525eee626ecb904cb64a7832ab3fcb869323bb6de046a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Archive::Tar::Wrapper) \
perl-Archive-Tar-Wrapper"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(CPAN::Meta) \
perl(File::Which) \
perl(IPC::Run) \
perl(Log::Log4perl)"

inherit rpm
