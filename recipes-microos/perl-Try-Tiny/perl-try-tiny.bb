SUMMARY = "Minimal try/catch with proper preservation of $@"
DESCRIPTION = "This module provides bare bones 'try'/'catch'/'finally' statements that are \
designed to minimize common mistakes with eval blocks, and NOTHING else. \
 \
This is unlike TryCatch which provides a nice syntax and avoids adding \
another call stack layer, and supports calling 'return' from the 'try' \
block to return from the parent subroutine. These extra features come at a \
cost of a few dependencies, namely Devel::Declare and Scope::Upper which \
are occasionally problematic, and the additional catch filtering uses Moose \
type constraints which may not be desirable either. \
 \
The main focus of this module is to provide simple and reliable error \
handling for those having a hard time installing TryCatch, but who still \
want to write correct 'eval' blocks without 5 lines of boilerplate each \
time. \
 \
It's designed to work as correctly as possible in light of the various \
pathological edge cases (see BACKGROUND) and to be compatible with any \
style of error values (simple strings, references, objects, overloaded \
objects, etc). \
 \
If the 'try' block dies, it returns the value of the last statement \
executed in the 'catch' block, if there is one. Otherwise, it returns \
'undef' in scalar context or the empty list in list context. The following \
examples all assign ''bar'' to '$x': \
 \
  my $x = try { die 'foo' } catch { 'bar' }; \
  my $x = try { die 'foo' } || 'bar'; \
  my $x = (try { die 'foo' }) // 'bar'; \
 \
  my $x = eval { die 'foo' } || 'bar'; \
 \
You can add 'finally' blocks, yielding the following: \
 \
  my $x; \
  try { die 'foo' } finally { $x = 'bar' }; \
  try { die 'foo' } catch { warn 'Got a die: $_' } finally { $x = 'bar' }; \
 \
'finally' blocks are always executed making them suitable for cleanup code \
which cannot be handled using local. You can add as many 'finally' blocks \
to a given 'try' block as you like. \
 \
Note that adding a 'finally' block without a preceding 'catch' block \
suppresses any errors. This behaviour is consistent with using a standalone \
'eval', but it is not consistent with 'try'/'finally' patterns found in \
other programming languages, such as Java, Python, Javascript or C#. If you \
learned the 'try'/'finally' pattern from one of these languages, watch out \
for this."
LICENSE = "MIT"

PV = "0.31"

RPM_NAME = "perl-Try-Tiny-0.31-1.8.noarch.rpm"
RPM_HASH = "0f0aed1f3eaf7db319ef08e633ffb16c086fbf5e00315288a5b54ed5b35d9506dc09a16bbf8e747badce708f43a853aaccac77a77fd4c2d2b5a0a5d2ddde6411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Try::Tiny) perl-Try-Tiny"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
