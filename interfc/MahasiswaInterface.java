/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRUDMahasiswaSederhana.interfc;

import CRUDMahasiswaSederhana.models.Mahasiswa;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface MahasiswaInterface {
    Mahasiswa insert(Mahasiswa o) throws SQLException;
    void update (Mahasiswa o) throws SQLException;
    void delete (Mahasiswa o) throws SQLException;
    List<Mahasiswa> getAll() throws SQLException;
    
}
