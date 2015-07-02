/*
 * filter: inliner warning; re-run with
 */
import scala.tools.partest.BytecodeTest

import scala.tools.nsc.util.JavaClassPath
import java.io.InputStream
import scala.tools.asm
import asm.ClassReader
import asm.tree.{ClassNode, InsnList}
import scala.collection.JavaConverters._

object Test extends BytecodeTest {
  def show: Unit = {
    val classNode = loadClassNode("SameBytecode")
    sameBytecode(getMethod(classNode, "a"), getMethod(classNode, "b"))
  }
}
