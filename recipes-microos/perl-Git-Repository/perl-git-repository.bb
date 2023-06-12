SUMMARY = "Perl interface to Git repositories"
DESCRIPTION = "Git::Repository is a Perl interface to Git, for scripted interactions with \
repositories. It's a low-level interface that allows calling any Git \
command, whether _porcelain_ or _plumbing_, including bidirectional \
commands such as 'git commit-tree'. \
 \
A Git::Repository object simply provides context to the git commands being \
run. It is possible to call the 'command()' and 'run()' methods against the \
class itself, and the context (typically _current working directory_) will \
be obtained from the options and environment. \
 \
As a low-level interface, it provides no sugar for particular Git commands. \
Specifically, it will not prepare environment variables that individual Git \
commands may need or use. \
 \
However, the 'GIT_DIR' and 'GIT_WORK_TREE' environment variables are \
special: if the command is run in the context of a Git::Repository object, \
they will be overridden by the object's 'git_dir' and 'work_tree' \
attributes, respectively. It is still possible to override them if \
necessary, using the 'env' option. \
 \
Git::Repository requires at least Git 1.5.0, and is expected to support any \
later version. \
 \
See Git::Repository::Tutorial for more code examples."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.325"

RPM_NAME = "perl-Git-Repository-1.325-3.1.noarch.rpm"
RPM_HASH = "3e77d2fb56a1bc60ac025194cfe3a89d2a07f337949b7ef31c9d8811af4471ded1e2c0662e640844d7e6a9eace23dc6d7787659d50ef3d5719d36e9f6a17acef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Git::Repository) \
perl(Git::Repository::Command) \
perl(Git::Repository::Plugin) \
perl(Test::Git) \
perl-Git-Repository"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Git::Version::Compare) \
perl(System::Command) \
perl(namespace::clean)"

inherit rpm
