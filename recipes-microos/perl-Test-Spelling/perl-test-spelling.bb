SUMMARY = "Check for spelling errors in POD files"
DESCRIPTION = "Test::Spelling lets you check the spelling of a 'POD' file, and report its \
results in standard Test::More fashion. This module requires a spellcheck \
program such as at http://hunspell.github.io/, _aspell_, _spell_, or, \
_ispell_. We suggest using Hunspell. \
 \
    use Test::Spelling; \
    pod_file_spelling_ok('lib/Foo/Bar.pm', 'POD file spelling OK'); \
 \
Note that it is a bad idea to run spelling tests during an ordinary CPAN \
distribution install, or in a package that will run in an uncontrolled \
environment. There is no way of predicting whether the word list or \
spellcheck program used will give the same results. You *can* include the \
test in your distribution, but be sure to run it only for authors of the \
module by guarding it in a 'skip_all unless $ENV{AUTHOR_TESTING}' clause, \
or by putting the test in your distribution's _xt/author_ directory. \
Anyway, people installing your module really do not need to run such tests, \
as it is unlikely that the documentation will acquire typos while in \
transit. \
 \
You can add your own stop words, which are words that should be ignored by \
the spell check, like so: \
 \
    add_stopwords(qw(asdf thiswordiscorrect)); \
 \
Adding stop words in this fashion affects all files checked for the \
remainder of the test script. See Pod::Spell (which this module is built \
upon) for a variety of ways to add per-file stop words to each .pm file. \
 \
If you have a lot of stop words, it's useful to put them in your test \
file's 'DATA' section like so: \
 \
    use strict; \
    use warnings; \
    use Test::More; \
 \
    use Test::Spelling; \
    use Pod::Wordlist; \
 \
    add_stopwords(<DATA>); \
    all_pod_files_spelling_ok(); \
 \
    __DATA__ \
    folksonomy \
    Jifty \
    Zakirov \
 \
To maintain backwards compatibility, comment markers and some whitespace \
are ignored. In the near future, the preprocessing we do on the arguments \
to Test::Spelling/'add_stopwords' will be changed and documented properly."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.25"

RPM_NAME = "perl-Test-Spelling-0.25-1.16.noarch.rpm"
RPM_HASH = "9ca8cad3f1e7647119345184b1208e4aec71a94abc054a7dcff9ef947a1d29852c8f253191f90dbf5c06b516c0e2709a8e008c168fc648bbf38a97e17b71fe57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Spelling) \
perl-Test-Spelling"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IPC::Run3) \
perl(Pod::Spell)"

inherit rpm
