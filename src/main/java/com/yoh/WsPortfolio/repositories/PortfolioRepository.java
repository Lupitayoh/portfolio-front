package com.yoh.WsPortfolio.repositories;

import com.yoh.WsPortfolio.models.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**@author Lupitayoh
 *
 */
@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
}
